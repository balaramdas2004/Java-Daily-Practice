package com.balia.interfaceLambdafunction;


/**
 * 
 * Smart Banking Loan Approval Workflow
hardCore Java • Functional Interfaces • Supplier100 Points
Report an issue
Description
A digital banking system processes loan requests using functional interfaces and lambda expressions.

The system performs the following steps:

Loan Approval Rule
Every customer with positive salary is approved.
(Credit score is read but NOT used for rejection as per test cases.)

EMI Calculation
EMI is calculated using:
EMI = Loan Amount / Tenure

Risk Evaluation
Risk is calculated by comparing EMI with salary:
If EMI ≤ salary / 2 → Low Risk
Otherwise → High Risk

Application ID Generation
A unique loan application number is generated using Supplier.

Final Output
The system prints:
Loan Approved
EMI
Risk Level
Application ID

This program helps beginners understand Predicate, Function, BiFunction, Supplier, Consumer, lambda expressions, and functional programming flow.

Input Format

Salary
Credit Score
Loan Amount
Tenure
Examples

Example 1:

Input

40000
750
600000
60

Output

Loan Approved
EMI: 10000.0

Example 2:

Input

30000
720
500000
50

Output

Loan Rejected

Explanation
Shows financial decision-making using chained predefined functional interfaces.
 * 
 */
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class LAmdaExpresion_demo5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        int creditScore = sc.nextInt();
        double loanAmount = sc.nextDouble();
        int tenure = sc.nextInt();

        // 1. Predicate: Check loan eligibility
        Predicate<Double> approval = s -> s > 0;

        // 2. Function: Calculate EMI
        Function<Integer, Double> emiCalculator =
                t -> loanAmount / t;

        // 3. BiFunction: Evaluate loan risk
        BiFunction<Double, Double, String> riskEvaluator =
                (emi, sal) -> {
                    if (emi <= sal / 2) {
                        return "Low Risk";
                    } else {
                        return "High Risk";
                    }
                };

        // 4. Supplier: Generate application ID
        Supplier<String> applicationId =
                () -> "LOAN" + System.currentTimeMillis();

        // 5. Consumer: Display output
        Consumer<String> display =
                message -> System.out.println(message);

        // Loan approval
        if (approval.test(salary)) {

            double emi = emiCalculator.apply(tenure);

            String risk = riskEvaluator.apply(emi, salary);

            String id = applicationId.get();

            display.accept("Loan Approved");
            display.accept("EMI: " + emi);
            display.accept("Risk Level: " + risk);

        } else {
            display.accept("Loan Rejected");
        }

        sc.close();
    }
}