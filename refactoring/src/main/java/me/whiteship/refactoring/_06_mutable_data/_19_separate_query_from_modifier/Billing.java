package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

public class Billing {

    private Customer customer;

    private EmailGateway emailGateway;

    public Billing(Customer customer, EmailGateway emailGateway) {
        this.customer = customer;
        this.emailGateway = emailGateway;
    }

    // 두가지 일을 할 수 있다. 총계를 계산하면서 bill을 보냄.
    // 조회하는 용도와 변경하는 용도를 각각 분리
//    public double getTotalOutstandingAndSendBill() {
//        double result = customer.getInvoices().stream()
//                .map(Invoice::getAmount)
//                .reduce((double) 0, Double::sum);
//        sendBill();
//        return result;
//    }
    public double totalOutstanding() {
        return customer.getInvoices().stream()
                .map(Invoice::getAmount)
                .reduce((double) 0, Double::sum);
    }

    public void sendBill() {
        emailGateway.send(formatBill(customer));
    }

    private String formatBill(Customer customer) {
        return "sending bill for " + customer.getName();
    }
}
