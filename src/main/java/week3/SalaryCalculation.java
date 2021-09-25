package week3;

public class SalaryCalculation {
    public static void main(String[] args) {
        SalesAgentSalary agent1Junior = new SalesAgentSalary(170, 1);
        SalesAgentSalary agent2Senior = new SalesAgentSalary(150, 1, 3, 10, 14000);
    }
}
// Во втором способе рассчета есть передаваемый параметр rate, он кажется лишним
// Потому, что мы рассчитываем базовый рейт основываясь на опыте сотрудника
// Поэтому я его передаю в конструктор, но не использую.