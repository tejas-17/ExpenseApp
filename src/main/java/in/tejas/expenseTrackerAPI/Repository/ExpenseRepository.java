package in.tejas.expenseTrackerAPI.Repository;

import in.tejas.expenseTrackerAPI.Entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long> {

}
