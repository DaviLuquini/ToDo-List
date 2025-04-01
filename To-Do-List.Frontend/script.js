const inputContainers = document.querySelectorAll('.input-container');
const inputs = document.querySelectorAll('.task-input'); 
const doneButtons = document.querySelectorAll('.done-button');
const clearTasks = document.querySelector('#clear-tasks');

inputs.forEach((input, index) => {
    const doneButton = doneButtons[index];
    const inputContainer = inputContainers[index];

    inputContainer.addEventListener('mouseenter', () => {
        if( input.value !== '') {
            doneButton.style.display = 'block';  
        }
    });

    inputContainer.addEventListener('mouseleave', () => {
        doneButton.style.display = 'none';  
    });

    doneButton.addEventListener('click', () => {
        input.value = '';
        doneButton.style.display = 'none';
    })
});

clearTasks.addEventListener('click', () => {
    inputs.forEach((input) => { 
        input.value = '';
    })
});
