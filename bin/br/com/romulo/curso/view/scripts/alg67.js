//const nome = document.getElementsById("nome")

const frm = document.querySelector("form")
const res = document.querySelector("h5")

frm.addEventListener("submit",(e)=>{
    const nome = frm.nome.value
    res.textContent = `Alô, ${nome}!`
    e.preventDefault()
} )