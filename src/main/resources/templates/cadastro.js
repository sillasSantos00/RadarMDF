document.addEventListener("DOMContentLoaded", () => {
  const nomeItem = document.getElementById("nomeItem");
  const codigoItem = document.getElementById("codigoItem");

  const codigos = {
    "CPU Dell i3": "555714",
    "CPU Dell i7": "555713",
    "CPU win 7": "555712",
    "CPU SOYO": "#N/A",
    "CPU Gamer": "",
    "CPU Grasep": "",
    "CPU Gen Capital": "",
    "CPU SOYO I3": "",
    "CPU Win CE": "555766",
    "Firestick": "555759",
    "Ar Condicionado Gen": "555756",
    "Impressora Generica": "555757",
    "Impressora epson m-2170": "555718",
    "Impressora elgin i9": "555719",
    "Impressora Zebra": "",
    "Impressora Pantum": "",
    "Impressora": "555757",
    "Monitor Dell 21 Pol": "555710",
    "Monitor Acer 21 Pol": "555711",
    "Monitor Generico 15": "555720",
    "Monitor Generico 16": "555721",
    "Monitor Generico 17": "555722",
    "Monitor Generico 18": "555723",
    "Monitor Generico 18,5": "555735",
    "Monitor Generico 19": "555764",
    "Monitor Generico 20": "",
    "Notebook Dell i5": "555715",
    "Notebook Dell i7": "555717",
    "Ramal Intelbras": "#N/A",
    "Switch": "555737",
    "Antena 4G elsys": "555740",
    "Mikrotik": "555736",
    "Projetor": "555758",
    "TV Generica": "555754",
    "DVR": "555739",
    "Roteador Tp-link": "555765",
    "Thin client": "555742",
    "mesa de som": "#N/A"
  };

  nomeItem.addEventListener("change", () => {
    codigoItem.value = codigos[nomeItem.value] || "";
  });

  document.getElementById("form-produto").addEventListener("submit", function (e) {
    e.preventDefault();
    const form = e.target;

    const data = {
      patrimonio: parseFloat(form.preco.value),
      nomeItem: form.nomeItem.value,
      codigoItem: form.codigoItem.value,
      tipo: form.tipo.value,
      loja: form.loja?.value || "",
      setor: form.setor?.value || "",
      estadoConservacao: form.estadoConservacao?.value || "",
      descricao: form.descricao.value
    };

    fetch("/api/produtos", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(dados)
    })
    .then(res => res.text())
    .then(msg => {
      form.reset();
      alert(msg);
    })
    .catch(() => alert("Erro ao cadastrar produto"));
  });
});
