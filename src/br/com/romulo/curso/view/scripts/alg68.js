//const nome = document.getElementsById("nome")

const frm = document.querySelector("form")
const res = document.querySelector("h5")

frm.addEventListener("submit",(e)=>{
    const nomeFilmefilme = frm.filme.value
    alert(`O filme escolhido foi: ${nomeFilme}`) 
    const tempo = Number(frm.tempo.value)
    const horas = Math.floor(tempo/60)
    const minutos = tempo %60
    alert(`O filme tem ${horas} hora(s) e ${minutos} minuto(s) de duração.`)
    e.preventDefault()
})
