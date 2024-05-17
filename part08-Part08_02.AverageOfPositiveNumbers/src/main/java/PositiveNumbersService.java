
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class PositiveNumbersService {
    private final List<Integer> positiveNumbers;
    
    public PositiveNumbersService() {
        this.positiveNumbers = new ArrayList<>();
    }
    
    public void addPositiveNumber(int num) {
        if(num > 0) {
            this.positiveNumbers.add(num);
        }
    }
    
    public Double calculateAverageOfPositiveNumbers() {
        return 1.0*this.calculateSumOfPositiveNumbers()/this.countOfPositiveNumbers();
    }
    public Integer countOfPositiveNumbers() {
        return this.positiveNumbers.size();
    }
    
    private Integer calculateSumOfPositiveNumbers() {
        return this.positiveNumbers.stream().mapToInt(Integer::intValue).sum();
    }
}
