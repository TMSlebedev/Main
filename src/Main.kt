class Main

fun main() {
    val student = Student()
    student.study()
    println(student.read(2))
    println(student.grow())

    val myGroup = Group()
    myGroup.doSmth()
    val mySubGroup = Group.SubGroup()
    mySubGroup.write()

    val myInnerGroup = Group().InnerGroup()
    myInnerGroup.talk()

}

