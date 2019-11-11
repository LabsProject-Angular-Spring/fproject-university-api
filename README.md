# university-api
 CRU for faculty,building and lab

port: 10010

Endpoints

- Faculty
    Lista Todos - /faculty/list get
    Consulta Especifica - /faculty/{id} get
    Insertar - /faculty/add post {"name": "value"} 
    Editar - /faculty/edit/{id} put {"name": "value"} 

- Building
    Lista Todos - /building/list get
    Consulta Especifica - /building/{id} get
    Insertar - /building/add post {"name": "value", "facultyid": "value"} 
    Editar - /building/edit/{id} put {"name": "value", "facultyid": "value"} 

- Lab
    Lista Todos - /lab/list get
    Consulta Especifica - /lab/{id} get
    Insertar - /lab/add post {"name": "value", "buildingid": "value"} 
    Editar - /lab/edit/{id} put {"name": "value", "buildingid": "value"} 

