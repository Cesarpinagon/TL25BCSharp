/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

/**
 *
 * @author User
 */
public class Token {
    public enum Type{
        BOOL, BYTE, CHAR, DECIMAL, DOUBLE, FLOAT, INT, LONG, OBJECT, SBYTE, SHORT,
        STRING, UINT, ULONG, USHORT, VOID,
        IF, ELSE, SWITCH, CASE, DEFAULT, WHILE, DO, FOR, FOREACH, BREAK, CONTINUE, GOTO, RETURN, YIELD,
        PUBLIC, PRIVATE, PROTECTED, INTERNAL,
        ABSTRACT, ASYNC, CONST, EVENT, EXTERN, NEW, OVERRIDE, PARTIAL, READONLY, SEALED, STATIC, UNSAFE, VIRTUAL, VOLATILE,
    }
    
    private final Type type;
    private final String value;
    private final int line;
    private final int column;
    
    public Token(Type type,String value,int line,int column){
        this.type=type;
        this.value=value;
        this.column=column;
        this.line=line;    
    }

    @Override
    public String toString() {
        return "Token{" + "type=" + type + ", value=" + value + ", line=" + line + ", column=" + column + '}';
    }
    
    
}
