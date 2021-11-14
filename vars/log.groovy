def call(def msg){
    echo "${getGreen}${msg}";
}


def info(def msg) {

        echo "${Green}${msg}";

}

def warn(def msg) {
        echo "${Cyan}${msg}";
}

def error(def msg) {

        echo "${Red}${msg}";

}

def getRed() { "\u001B[31m" }

def getGreen() { "\u001B[32m" }

def getCyan() { "\u001B[36m" }
