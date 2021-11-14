def call(def msg){
    echo "${getGreen}${msg}";
}


def info(def msg) {
    ansiColor('xterm') {
        echo "${getGreen}${msg}";
    }
}

def warn(def msg) {
    ansiColor('xterm') {
        echo "${getCyan}${msg}";
    }
}

def error(def msg) {
    ansiColor('xterm') {
        echo "${getRed}${msg}";
    }
}

def getRed() { "\u001B[31m" }

def getGreen() { "\u001B[32m" }

def getCyan() { "\u001B[36m" }
