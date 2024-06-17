let user = {
    name: "",
    email: "",
    age: ""
};

function updateUserInfo(event) {
    event.preventDefault();
    user.name = document.getElementById("name").value;
    user.email = document.getElementById("email").value;
    user.age = document.getElementById("age").value;

    displayUserInfo();
}

function displayUserInfo() {
    const outputDiv = document.getElementById("output");
    outputDiv.innerHTML = `
        <h3>User Information</h3>
        <p><strong>Name:</strong> ${user.name}</p>
        <p><strong>Email:</strong> ${user.email}</p>
        <p><strong>Age:</strong> ${user.age}</p>
        <p><strong>Birth Year:</strong> ${calculateBirthYear()}</p>
    `;
}

function calculateBirthYear() {
    const currentYear = new Date().getFullYear();
    return currentYear - user.age;
}

document.getElementById("userInfoForm").addEventListener("submit", updateUserInfo);