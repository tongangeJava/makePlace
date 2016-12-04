package qin.destoon;

public class Session
{
    public Transaction beginTransaction()
    {
        //System.out.println("已开启事务");

        return new Transaction();
    }

    public Session()
    {
        //System.out.println("in public Session");
    }

    public void save(UserCountry userCountry)
    {
        //System.out.println("保存实体类为:" + userCountry);
    }
}