package domain



data class Category(
    val categoryId: String,
    val displayOrder: Int?,
    val subCategoryOf: List<String> = listOf(),
    val name: String?,
    val items: MutableList<FoodItem> = mutableListOf()
)
