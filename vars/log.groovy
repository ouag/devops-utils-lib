import com.ouag.utils.logging.Log2




def call(def msg) {
    println(msg)
}

def getTimestamp() {
    Date date = new Date();
    return  date.toString();
}

def info(def msg) {
    Log2 l = new Log2()
    l.info(msg)
}

def warn(def msg) {
    println(getTimestamp() + " - WARN " + msg)
}


def error(def msg) {
    println(getTimestamp() + " - ERROR " + msg)
}


