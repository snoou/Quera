const hamburger = document.querySelector(".hamburger");
const mobileMenu = document.getElementById("mobileMenu");

hamburger.addEventListener("click", () => {
    mobileMenu.classList.toggle("show");
});