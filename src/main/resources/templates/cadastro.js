document.addEventListener("DOMContentLoaded", () => {
  const nomeItem = document.getElementById("nomeItem");
  const codigoItem = document.getElementById("codigoItem");

  // 🌟 Códigos por nome de item
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

  // 🔁 Atualiza o campo código conforme a seleção
  nomeItem.addEventListener("change", () => {
    codigoItem.value = codigos[nomeItem.value] || "";
  });

  // 📨 Envia os dados para a API da planilha
  document.getElementById("form-produto").addEventListener("submit", async function (e) {
    e.preventDefault();
    const form = e.target;

    const data = {
      codigo: form.codigoItem.value,
      setor: form.setor?.value || "",
      estado: form.estadoConservacao?.value || "",
      observacoes: form.descricao.value
    };

    // ❗ Valida se o código é válido
    if (!data.codigo || data.codigo === "#N/A") {
      alert("Selecione um item com código válido.");
      return;
    }

    try {
      const resposta = await fetch("https://script.google.com/macros/s/AKfycbz6On0WEIKtb02fNuqRQoOXnzgGY7s3kfpyEYtwCtbfSQ9Ef7vyyGKxtF1qXQ6IK0nO/exec", {
        method: "POST",
        body: new URLSearchParams(data)
      });

      const texto = await resposta.text();
      alert(texto);
      form.reset();
      codigoItem.value = ""; // limpa o campo código
    } catch (err) {
      alert("Erro ao atualizar item.");
      console.error(err);
    }
  });
});
