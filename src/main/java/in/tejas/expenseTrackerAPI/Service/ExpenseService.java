package in.tejas.expenseTrackerAPI.Service;

import in.tejas.expenseTrackerAPI.Entity.Expense;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ExpenseService {

    List<Expense> getAllExpenses();
}
