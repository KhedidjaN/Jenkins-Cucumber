import java.util.ArrayList;

class AHmed{



    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        a.add("Lila");
        a.add("Samir");
        a.add("Nabil");
        a.add("Yasmine");
        a.add("Yasmine");
        a.add("");
        a.add(4,"Dlala");
        a.set(4,"Shahin");
        System.out.println(a);

        for (int i=0; i<a.size(); i++){
            System.out.print(a.get(i)+" ");
        }

    }

    }


