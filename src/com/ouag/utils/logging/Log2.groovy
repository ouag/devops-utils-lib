package com.ouag.utils.logging

class Log2 {

    def getTimestamp() {
        Date date = new Date();
        return  date.toString();
    }

    def info(def msg) {
        System.out.println(getTimestamp() + " - INFO " + msg)
    }

    def warn(def msg) {
        System.out.println(getTimestamp() + " - WARN " + msg)
    }

    def error(def msg) {
        System.out.println(getTimestamp() + " - ERROR " + msg)
    }

}
