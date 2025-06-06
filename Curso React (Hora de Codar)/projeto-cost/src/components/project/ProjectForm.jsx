import {useState, useEffect} from 'react'

import styles from './ProjectForm.module.css'
import Input from '../form/Input'
import Select from '../form/Select'
import SubmitBtn from '../form/SubmitBtn'

function ProjectForm({ btnText }) {
    const [categories, setCategories] = useState([]);

    useEffect(()=>{
        fetch('http://localhost:5000/categories', {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then((resp) => resp.json())
        .then((data) => setCategories(data))
        .catch((err) => console.log(err))
    }, [])

    return (
        <form className={styles.form}>
            <Input type="text" text="Nome do projeto" name="name" placeholder="Insira o nome do projeto"></Input>
            <Input type="number" text="Orçamento do projeto" name="budget" placeholder="Insira o orçamento do projeto"></Input>
            <Select name="category_id" text="Selecione a categoria" options={categories}></Select>
            <SubmitBtn text={btnText}></SubmitBtn>
        </form>
    )
}

export default ProjectForm;