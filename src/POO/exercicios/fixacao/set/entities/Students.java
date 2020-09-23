package POO.exercicios.fixacao.set.entities;

import java.util.Objects;

public class Students {

    private int code;

    public Students(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students student = (Students) o;
        return code == student.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
