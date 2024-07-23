package in.tejas.expenseTrackerAPI.Service;

import in.tejas.expenseTrackerAPI.Entity.Expense;
import in.tejas.expenseTrackerAPI.Repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    private ExpenseRepository expenseRepo;
    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepo.findAll();
    }
}
