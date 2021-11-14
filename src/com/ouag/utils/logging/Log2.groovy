package com.ouag.utils.logging

class Log2 {

    def getTimestamp() {
        Date date = new Date();
        return  date.toString();
    }

    def info(def msg) {
        println(getTimestamp() + " - INFO " + msg)
    }

    def warn(def msg) {
        println(getTimestamp() + " - WARN " + msg)
    }

    def error(def msg) {
        println(getTimestamp() + " - ERROR " + msg)
    }

}
