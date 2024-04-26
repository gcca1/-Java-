package com.gcc.javacore.day28第六章接口打印机项目练习;

/**
 * 打印机
 */
public class Printer implements Print{
    //纸张
    private Paper paper ;
//墨盒
    private Inkbox inkbox;

    public Printer() {
    }

    public Printer(Paper paper, Inkbox inkbox) {
        this.paper = paper;
        this.inkbox = inkbox;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public Inkbox getInkbox() {
        return inkbox;
    }

    public void setInkbox(Inkbox inkbox) {
        this.inkbox = inkbox;
    }

    @Override
    public void print(String content) {
        for(int i=0;i<content.length();i++){
            char str =content.charAt(i);
            inkbox.getColor().print(str);
            try {
                //休眠多少秒
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(i);
            if((i+1)%paper.getPageSize()==0){
               //System.out.println("该换行了");
                System.out.println("");


            }
        }
    }
}

