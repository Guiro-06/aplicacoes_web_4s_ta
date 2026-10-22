import { PrimeiroComponente } from "../components/PrimeiroComponente";
import { ArrowFunction } from "../components/PrimeiroComponente";

export default function Home(){
  return(
  <>
  <PrimeiroComponente mensagem = 'Passando mensagem como parâmetro'/>
  <ArrowFunction />
  </>
  );
}