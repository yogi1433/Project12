// pass by Referance
class Pg
{
void room()
{
System.out.println("need room for staying");
}
}
class leaseApartment
{
public static void main(String[] args)
{
Pg p=new Pg();
Customer1.needRoom(p);
Customer2.needRoom(p);
}
}
class Customer1
{
static void needRoom(Pg p1)
{
p1.room();
}
}
class Customer2
{
static void needRoom(Pg p2)
{
p2.room();
}
}

