-- USER 1 - 3 Solicitações para o mesmo usário, sem duplicidade -> com base de dados de users
INSERT INTO tbl_user (nome, sobrenome, cpf, telefone, renda) VALUES ('José', 'Carlos da Silva', '53824462898', '11973709100', 2050.34);
INSERT INTO tbl_proposta (valor_solicitado, prazo_para_pagamento, aprovado, user_id) VALUES (4500.00, 24, false, 1);
INSERT INTO tbl_proposta (valor_solicitado, prazo_para_pagamento, aprovado, user_id) VALUES (6500.00, 30, false, 1);
INSERT INTO tbl_proposta (valor_solicitado, prazo_para_pagamento, aprovado, user_id) VALUES (2500.00, 12, false, 1);

-- USER 2 - 3 Solicitações para o mesmo usário, com duplicidade -> sem base de dados de users
-- Assim como está ocorrendo nos testes de API no Insominia
INSERT INTO tbl_user (nome, sobrenome, cpf, telefone, renda) VALUES ('Mara', 'Rodrigues Pereira', '73224462833', '11983509100', 10500.21);
INSERT INTO tbl_proposta (valor_solicitado, prazo_para_pagamento, aprovado, user_id) VALUES (14500.00, 12, false, 2);

INSERT INTO tbl_user (nome, sobrenome, cpf, telefone, renda) VALUES ('Mara', 'Rodrigues Pereira', '73224462833', '11983509100', 10500.21);
INSERT INTO tbl_proposta (valor_solicitado, prazo_para_pagamento, aprovado, user_id) VALUES (26500.00, 36, false, 3);

INSERT INTO tbl_user (nome, sobrenome, cpf, telefone, renda) VALUES ('Mara', 'Rodrigues Pereira', '73224462833', '11983509100', 10500.21);
INSERT INTO tbl_proposta (valor_solicitado, prazo_para_pagamento, aprovado, user_id) VALUES (6500.00, 6, true, 4);

-- USER 3 - Assim como o USER 2
INSERT INTO tbl_user (nome, sobrenome, cpf, telefone, renda) VALUES ('Felipe', 'James dos Santos', '11224464433', '11983509211', 8500.21);
INSERT INTO tbl_proposta (valor_solicitado, prazo_para_pagamento, aprovado, user_id) VALUES (10000.00, 6, false, 5);

INSERT INTO tbl_user (nome, sobrenome, cpf, telefone, renda) VALUES ('Felipe', 'James dos Santos', '11224464433', '11983509211', 8500.21);
INSERT INTO tbl_proposta (valor_solicitado, prazo_para_pagamento, aprovado, user_id) VALUES (12000.00, 18, false, 6);

INSERT INTO tbl_user (nome, sobrenome, cpf, telefone, renda) VALUES ('Felipe', 'James dos Santos', '11224464433', '11983509211', 8500.21);
INSERT INTO tbl_proposta (valor_solicitado, prazo_para_pagamento, aprovado, user_id) VALUES (5000.00, 12, true, 7);

-- USER 4 - Assim como o USER 1
INSERT INTO tbl_user (nome, sobrenome, cpf, telefone, renda) VALUES ('Júlia', 'Lima', '83826562898', '11977609139', 1850.00);
INSERT INTO tbl_proposta (valor_solicitado, prazo_para_pagamento, aprovado, user_id) VALUES (9500.00, 30, false, 8);
INSERT INTO tbl_proposta (valor_solicitado, prazo_para_pagamento, aprovado, user_id) VALUES (7500.00, 24, false, 8);
INSERT INTO tbl_proposta (valor_solicitado, prazo_para_pagamento, aprovado, user_id) VALUES (2500.00, 12, true, 8);