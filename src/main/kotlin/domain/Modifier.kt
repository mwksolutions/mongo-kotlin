package domain

data class Modifier(
    val myModifierId: String,
    val guidId: String?,
    val maxOptions: Int?,
    val minOptions: Int?,
    val modifierId: String,
    val name: String?,
    val displayOrder: Int?,
    val options: List<ModifierOption>?
)