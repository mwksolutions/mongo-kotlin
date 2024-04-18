package domain


import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class FoodItem(
    val foodItemId: String,
    var onSale:Boolean? = true,
    val imageUrl:String? = null,
    val allergens: List<String>?,
    val description: String?,
    val hasImage: Boolean?,
    val hasModifiers: Boolean?,
    val numberAvailable: Int?,
    val name: String?,
    val displayOrder: Int?,
    val price: Double?,
    val taxAmount: Double? = null,
    val taxRate: Double? = null,
    val taxRateId: String? = null,
    val taxRateIds:MutableList<String>? = mutableListOf(),
    val thumbnail: List<Byte>?,
    val alcohol: Boolean? = false,
    val modifiers: MutableList<Modifier> = mutableListOf()
)