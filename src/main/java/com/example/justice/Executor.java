package com.example.justice;

public class Executor {
    private String typeExecutor;
    private String nameExecutor;

    public Executor() {
    }

    public Executor(String typeExecutor, String nameExecutor) {
        this.typeExecutor = typeExecutor;
        this.nameExecutor = nameExecutor;
    }

    public String getTypeExecutor() {
        return typeExecutor;
    }

    public void setTypeExecutor(String typeExecutor) {
        this.typeExecutor = typeExecutor;
    }

    public String getNameExecutor() {
        return nameExecutor;
    }

    public void setNameExecutor(String nameExecutor) {
        this.nameExecutor = nameExecutor;
    }
}
