import com.ouag.utils.logging.Log2


Log2 log2 - new Log2()

def call(def msg) {
    println(msg)
}

def getTimestamp() {
    Date date = new Date();
    return  date.toString();
}

def info(def msg) {
    log2.info(msg)
}

def warn(def msg) {
    println(getTimestamp() + " - WARN " + msg)
}


def error(def msg) {
    println(getTimestamp() + " - ERROR " + msg)
}


