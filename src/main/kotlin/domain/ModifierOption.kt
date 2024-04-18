package domain

data class ModifierOption(
    val description: String?,
    val optionId: String?,
    val maxSelections: Int?,
    val name: String?,
    val displayOrder: Int?,
    val price: Double?,
    val taxAmount: Double? = null
)