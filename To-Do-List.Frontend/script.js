const inputs = document.querySelectorAll('.task-input');
const buttons = document.querySelectorAll('.done-button');


inputs.forEach((input, index) => {
    const button = buttons[index];  

    input.addEventListener('hover', () => {
        button.style.display = 'block';  
    });

    input.addEventListener('blur', () => {
        button.style.display = 'none';  
    });
});
