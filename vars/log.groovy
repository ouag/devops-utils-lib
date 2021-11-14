def call(def msg) {
    echo "${getGreen}${msg}";
}

def getRed() { "\u001B[31m" }

def getGreen() { "\u001B[32m" }

def getCyan() { "\u001B[36m" }

def info(def msg) {

    echo "${getGreen}${msg}";

}

def warn(def msg) {
    echo "${getCyan}${msg}";
}

def error(def msg) {

    echo "${getRed}${msg}";

}


