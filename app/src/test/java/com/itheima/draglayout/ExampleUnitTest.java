package com.itheima.draglayout;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        List<OldBean> oldBean =new ArrayList<>();
        oldBean.add(new OldBean("组1",1));
        oldBean.add(new OldBean("单元1组1",2));
        oldBean.add(new OldBean("单元2组1",2));
        oldBean.add(new OldBean("单元3组1",2));
        oldBean.add(new OldBean("单元4组1",2));
        oldBean.add(new OldBean("单元5组1",2));
        oldBean.add(new OldBean("组2",1));
        oldBean.add(new OldBean("单元1组2",2));
        oldBean.add(new OldBean("单元2组2",2));
        oldBean.add(new OldBean("组3",1));
        oldBean.add(new OldBean("组4",1));
        oldBean.add(new OldBean("单元1组4",2));
        oldBean.add(new OldBean("单元2组4",2));
        oldBean.add(new OldBean("单元3组4",2));
        oldBean.add(new OldBean("单元4组4",2));
        List<NewGrup> items= new ArrayList<>();
            for (int i = 0; i < oldBean.size(); i++) {
                OldBean nav = oldBean.get(i);
                NewGrup item = null;
                if (nav.getGrod() == 0 || nav.getGrod() == 1) {
                    item = new NewGrup();
                    item.title = nav.getTitle();
                }
                if(i<oldBean.size()-1){
                    while (oldBean.get(++i).getGrod() > 1) {
                        NewBean child = new NewBean();
                        child.title =oldBean.get(i).getTitle();
                        item.newBeens.add(child);
                        if(i>=oldBean.size()-1){
                            break;
                        }
                    }
                    i--;
                }
                items.add(item);
            }


        System.out.println("==============");
    }
}