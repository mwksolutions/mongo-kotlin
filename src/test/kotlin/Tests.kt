import domain.VisitFoodMenu
import org.junit.jupiter.api.Test

class Tests {
    @Test
    fun runTest() {
        VisitFoodMenu.takeItemOffSale(tenantId = "7563716e-9694-4c71-b162-16d3b593031e",
            itemId = "STK-01")
    }

}