package week3;

public class SalaryCalculation {
    public static void main(String[] args) {
        SalesAgentSalary agent1Junior = new SalesAgentSalary(160, 1);
        SalesAgentSalary agent2Junior = new SalesAgentSalary(190,1);
        SalesAgentSalary agent3Senior = new SalesAgentSalary(150, 1, 3, 10, 10000);
        SalesAgentSalary agent4Senior = new SalesAgentSalary(180, 1, 4, 20, 15000);

        //OUTPUT :
//Salary of this junior agent is : $160.0
//Salary of this junior agent is : $235.0
//Salary of this senior agent is : $180.0
//Salary of this senior agent is : $764.0
    }
}
// Во втором способе рассчета есть передаваемый параметр rate, он кажется лишним
// Потому, что мы рассчитываем базовый рейт основываясь на опыте сотрудника
// Поэтому я его передаю в конструктор, но не использую.