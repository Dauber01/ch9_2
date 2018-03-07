package com.wisely.ch9_2.batch;

import com.wisely.ch9_2.domain.Person;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;

/**
 * 数据处理及校验
 * @author Lucifer
 * @date 2018/03/05 14:43
 */
public class CsvItemProcess extends ValidatingItemProcessor<Person>{

    @Override
    public Person process(Person item) throws ValidationException {
        super.process(item);

        if(item.getNation().equals("汉族")){
            item.setNation("01");
        }else {
            item.setNation("02");
        }
        return item;
    }

}
