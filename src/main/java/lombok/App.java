package lombok;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Person1 person1 = new Person1("suayb","simsek",1);
        Person2  person2 = new Person2("emir", "aglamaz",20);

        System.out.println("person1 : "+person1.getAd()+"  "+ person1.getSoyad()+"  "+person1.getYas());
        System.out.println("person2 : "+person2.getAd()+"  "+ person2.getSoyad()+"  "+person2.getYas());
    }
}
