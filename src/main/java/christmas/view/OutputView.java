package christmas.view;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Map;

import christmas.event.GivenEvent;
import christmas.order.Orders;
import lib.enumeration.Badge;
import lib.enumeration.Menu;

public class OutputView {
    private final PrintStream printStream = System.out;
    private final String NO_ITEM = "없음";
    private final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("###,###");
    
    public void viewEventPlanner(Orders orders) {
        viewOrders(orders);
        viewTotalPrice(orders);
        viewGivenBenefit(orders);
        viewBenefits(orders);
        viewTotalBenefit(orders);
        viewPayPrice(orders);
        viewBadge(orders);
    }

    public void viewIntro() {
        printStream.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
    }

    public void viewStartMessege() {
        printStream.println("12월 26일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
        printStream.println("");
    }
    
    public void viewOrders(Orders orders) {
        printStream.println("<주문 메뉴>");

        for (Map.Entry<String, Integer> order: orders.getOrders().entrySet()) {
            printStream.println(order.getKey() + " " + order.getValue() + "개");
        }

        printStream.println("");
    }
}
