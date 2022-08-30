import React, { useState, useContext } from 'react';
import TodoContext from '../context/TodoContext';

function TodoInput() {
    const { addTodo } = useContext(TodoContext);

    const [newTodo, setNewTodo] = useState('');

    const handleChange = ({ target }) => {
        setNewTodo(target.value)
    }

    const handleClick = () => {
        addTodo(newTodo);
        setNewTodo('');
    }

    return (
        <section>
            <label htmlFor="addTodo">
                Insira uma tarefa:
                <input
                    value={newTodo}
                    onChange={handleChange}
                    type="text"
                    name="newTodo"
                    id="newTodo"
                />
            </label>
            <button onClick={handleClick}>Adicionar Tarefa</button>
        </section>

    )
}


export default TodoInput;
