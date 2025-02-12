package ru.yandex.practicum.contacts.presentation.base;



public interface ListDiffCallback<T> {
    boolean theSameAs(T newElement);
    boolean equals(Object o);
}
