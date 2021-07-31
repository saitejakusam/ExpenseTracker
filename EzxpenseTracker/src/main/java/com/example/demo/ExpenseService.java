package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

public interface ExpenseService {
List<Expense> getAllExpenses();
List<Expense> getAllExpenseByEmail(String email);
Expense getExpenseById(long id);
}
