package edu.buffalo.www.cse4562;

import net.sf.jsqlparser.statement.select.Join;

import java.util.ArrayList;

public class Join_Visitor {
    static Join join;
    static public void ret_type(Join join_item,Iterator_Interface iter)
    {

        join = join_item;
        if(join_item.getOnExpression()==null)
        {
            System.out.println("JOIN : "+join_item.getRightItem());
            From_Visitor.ret_type(join_item.getRightItem());
        }
    }
}
