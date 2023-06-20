package com.softbabysi.demo.Dto;

public class RegisterCodeDto {

    private String correo;

    private String codigo;

    public RegisterCodeDto() {
    }

    public RegisterCodeDto(String correo, String codigo) {
        this.correo = correo;
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "RegisterCodeDto{" +
                "correo='" + correo + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
