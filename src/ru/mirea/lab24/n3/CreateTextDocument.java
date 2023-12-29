package ru.mirea.lab24.n3;

public class CreateTextDocument implements iCreateDocument
{
    @Override
    public iDocument createNew() {
        return new TextDocument();
    }

    @Override
    public iDocument createOpen() {
        return new TextDocument();
    }
}
