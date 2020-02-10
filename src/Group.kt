class Group {
        private val id = 900

        fun doSmth() = 1

    class SubGroup {
        fun write() {
            println("I am writing")

        }
    }

    inner class InnerGroup {
        fun talk() {
            println("I am talking, my group id is $id")
            this@Group.doSmth()
            doSmth()
        }

        fun doSmth() = 2
    }

}