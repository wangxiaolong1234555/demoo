public class Demo {
    public static void main(String[] args) {
        try {
            setSex("双性人");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("非男非女");
        }

    }
    public static void setSex(String sex) throws Exception{
        if (!(sex.equals("男")||sex.equals("女"))){
            throw new Exception("");
        }
    }
}

