package les.scli.utils;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeeklyExpense {
    private Double valor;
    private Date semana;
}
