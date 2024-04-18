package domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.mongodb.client.model.Filters
import com.mongodb.client.model.ReplaceOptions
import mongo.Mdb
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

//Requires unique index on tenantId + selector
@JsonIgnoreProperties(ignoreUnknown = true)
data class VisitFoodMenu(
                @BsonId val id: ObjectId,
                val selector:String,
                val tenantId:String,
                val categories:List<Category>) {
    companion object {


        private val col = Mdb.db.getCollection<VisitFoodMenu>("VisitFoodMenu")
        fun takeItemOffSale(tenantId:String, itemId:String) {

            val menus = col.find<VisitFoodMenu>(
                Filters.and(
                    Filters.eq(VisitFoodMenu::tenantId.name, tenantId),
                    Filters.eq("categories.items.foodItemId",itemId)
                )

            )

            println()

        }
    }

    fun save()  {
        val filter = Filters.and(
            Filters.eq(VisitFoodMenu::selector.name, this.selector),
            Filters.eq(VisitFoodMenu::tenantId.name, this.tenantId)
        )
        col.replaceOne(filter,this, ReplaceOptions().upsert(true))
    }
}