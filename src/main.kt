fun main(){

    num(11,4)
    me("mitchelle hope waithera","23")
    school()


}
//iven a string “codeHive”. Write a function that prints out a string composed
//of the fifth, sixth, seventh and eighth  characters of the string (2 points)
//2. Create and invoke a function that given two numbers returns the
//remainder of their division (3 point
fun school (){
    var a = "codehive"
    println(a[4].toString()+a[5]+a[6]+a[7])
}

fun num(d:Int,e:Int){
    val b =d%e
    println(b)
}
fun me(name:String,age:String){
    val x =("hi my name is $name and i am $age years old")
    println(x)

     }

fun fruit (){
    var z= "watermelon"
    println(z.length)
     }