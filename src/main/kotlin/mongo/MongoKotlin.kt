package mongo

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.kotlin.client.MongoClient
import org.bson.codecs.configuration.CodecRegistries
import org.bson.codecs.kotlin.DataClassCodecProvider



object Mdb {
    private const val CONNECTION_STRING = "YOUR_CONNECTION_STRING"
    private const val DATABASE_NAME = "YOUR_DATABASENAME"
    private val clientSettings = MongoClientSettings.builder()
        .applyConnectionString(ConnectionString(CONNECTION_STRING))
        .codecRegistry(
            CodecRegistries.fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(DataClassCodecProvider())
            )
        ).build()
    private val client = MongoClient.create(clientSettings)
    val db = client.getDatabase(DATABASE_NAME)

}



